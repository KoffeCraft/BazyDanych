package com.lusia.bazydanych;

import androidx.room3.Entity;
import androidx.room3.PrimaryKey;

@Entity(tableName = "gry")
public class Gra {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nazwa;
    public String kategoria;
    public int minimalniaLiczbaOsob;
    public int maksLiczbaOsob;
    public int kategoriaWiekowa;

    public Gra(int kategoriaWiekowa, int maksLiczbaOsob, int minimalniaLiczbaOsob, String kategoria, String nazwa) {
        this.kategoriaWiekowa = kategoriaWiekowa;
        this.maksLiczbaOsob = maksLiczbaOsob;
        this.minimalniaLiczbaOsob = minimalniaLiczbaOsob;
        this.kategoria = kategoria;
        this.nazwa = nazwa;
    }
}
