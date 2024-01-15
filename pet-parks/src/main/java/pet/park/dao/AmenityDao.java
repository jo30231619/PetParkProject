package pet.park.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import pet.park.entity.Amenity;

public interface AmenityDao extends JpaRepository<Amenity, Long> {

	Set<Amenity> findAllByAmenityIn(Set<String> amenities);

}


//just creating the declaration, spring will load this, parse it out and create the sequel and add the amenities