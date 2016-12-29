package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/12/28 0028.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("drsg")
    public Dress dress;

    @SerializedName("flu")
    public Cold cold;

    public Sport sport;

    @SerializedName("trav")
    public Travel travel;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("uv")
    public Ultraviolet ultraviolet;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class Dress {
        @SerializedName("txt")
        public String info;
    }

    public class Cold {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

    public class Travel {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Ultraviolet {
        @SerializedName("txt")
        public String info;
    }
}
