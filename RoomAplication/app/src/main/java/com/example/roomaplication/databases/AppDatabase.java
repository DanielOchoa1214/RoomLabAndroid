package com.example.roomaplication.databases;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomaplication.dao.UserDao;
import com.example.roomaplication.entities.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
