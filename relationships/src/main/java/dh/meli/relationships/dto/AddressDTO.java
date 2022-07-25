package dh.meli.relationships.dto;

import dh.meli.relationships.model.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddressDTO {
    private String location;

    public AddressDTO(Address address) {
        this.location = address.getLocation();
    }

}
