package com.wxd.wanandroidmvvm.app

import androidx.annotation.NonNull
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.wxd.wanandroidmvvm.db.dao.LoginDao
import com.wxd.wanandroidmvvm.ui.entity.Login


//双重校验锁式-单例 封装AppDatabase 方便直接快速调用简单的接口
val appDatabase: AppDatabase by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
    AppDatabase.INSTANCE
}

/**
 * entities可关联多张表
 * exportSchema设置是否导出到文件夹
 * 后续的数据库升级是根据这个version来比较的
 */
@Database(entities = [Login::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    companion object {
        private const val TAG = "AppDatabase"
        val INSTANCE: AppDatabase by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            Room.databaseBuilder(MyApplication.instance, AppDatabase::class.java, "wanandroid.db")
                //可以在主线程操作
                .allowMainThreadQueries()
                //数据库升级异常之后的回滚
                .fallbackToDestructiveMigration()
                //每次添加都需要更新，测试时可持续添加 发布版本时删除所有旧版本
                //.addMigrations(new MyMigration(1, 2), new MyMigration(2, 3)) 数据库升级操作
                .build()
        }
    }

    private class MyMigration internal constructor(startVersion: Int, endVersion: Int) :
        Migration(startVersion, endVersion) {
        override fun migrate(@NonNull database: SupportSQLiteDatabase) {
            when (startVersion) {
                1 -> database.execSQL("ALTER TABLE User ADD COLUMN age integer")
                2 -> database.execSQL("CREATE TABLE IF NOT EXISTS `book` (`uid` INTEGER PRIMARY KEY autoincrement, `name` TEXT , `userId` INTEGER, 'time' INTEGER)")
            }
        }
    }

    abstract fun loginDao(): LoginDao

}