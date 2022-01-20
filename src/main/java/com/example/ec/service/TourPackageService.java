package com.example.ec.service;

import com.example.ec.domain.TourPackage;
import com.example.ec.repo.TourPackageRepository;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {

    private final TourPackageRepository tourPackageRepository;

    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    /**
     * Create a Tour Package
     *
     * @param code code of the package
     * @param name name of the package
     * @return new or existing tour package
     */
    public TourPackage createTourPackage(String code, String name) {
        //check if code already exist
        //if it does not exist create the tour package
        //do not create if it already exist
        return tourPackageRepository.findById(code)
                                        .orElse(tourPackageRepository
                                            .save(new TourPackage(code, name)));
    }

    /**
     * Lookup all Tour Packages
     * @return all Tour packages
     */

    public Iterable<TourPackage> lookup() {
        return tourPackageRepository.findAll();
    }

    public long total() {
        return  tourPackageRepository.count();
    }
}
