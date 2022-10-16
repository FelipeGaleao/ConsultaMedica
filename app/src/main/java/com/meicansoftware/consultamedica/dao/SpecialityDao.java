package com.meicansoftware.consultamedica.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.meicansoftware.consultamedica.models.Speciality;

import java.util.List;

@Dao
public interface SpecialityDao {

    @Insert
    void insertAll(Speciality specialty);

    @Query("SELECT * FROM Specialities")
    List<Speciality> getAll();
}