package eleventhAvenue.assignment.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String zipcode;

    protected Address() {
    }

    public Address(String zipcode) {

        this.zipcode = zipcode;
    }
}
