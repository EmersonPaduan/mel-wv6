package dh.meli.relationships.dto;

import dh.meli.relationships.model.Author;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDTO {
    private String name;
    private AddressDTO addressDTO;

    public AuthorDTO(Author author) {
        this.name = author.getName();
        this.addressDTO =  new AddressDTO(author.getAddress());
    }
}
