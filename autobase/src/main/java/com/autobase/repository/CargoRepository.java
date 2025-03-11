package com.autobase.repository;

import com.autobase.model.CargoRequest;
import java.util.ArrayList;
import java.util.List;

public class CargoRepository {
    private List<CargoRequest> cargoRequests = new ArrayList<>();

    public void addCargoRequest(CargoRequest cargoRequest) {
        cargoRequests.add(cargoRequest);
    }

    public List<CargoRequest> getAllCargoRequests() {
        return cargoRequests;
    }
}
