package game.controllers.dto;

public class ProductDto extends ResourсeDto {
    private Integer numPerSec;

    public ProductDto() {
    }

    public ProductDto(Integer id, String name, String description, Integer numPerSec) {
        super(id, name, description);
        this.numPerSec = numPerSec;
    }

    public Integer getNumPerSec() {
        return numPerSec;
    }

    public void setNumPerSec(Integer numPerSec) {
        this.numPerSec = numPerSec;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "numPerSec=" + numPerSec +
                "} " + super.toString();
    }
}
