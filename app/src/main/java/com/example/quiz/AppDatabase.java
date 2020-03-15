package com.example.quiz;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.quiz.Flashcard;
import com.example.quiz.FlashcardDao;

@Database(entities = {Flashcard.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FlashcardDao flashcardDao();
}
