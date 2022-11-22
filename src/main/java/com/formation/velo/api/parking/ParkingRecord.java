package com.formation.velo.api.parking;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ParkingRecord {
    @SerializedName("recordid")
    private String recordId;
    @SerializedName("fields")
    private ParkingField field;
}
