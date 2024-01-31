package ex3;

import java.util.List;

public class Animal {

    /** espece : espece de l'animal ( exemple: lion, serpent, ...)**/
    private EspeceAnimal espece;

    /**famille: famille de l'animal si c'est un mamifere, un poisson un serpent etc  **/
    private FamilleAnimal famille;

    /** regime : regime alimentaire de l'animal (carnivore, herbivore, ...) **/
    private RegimeAllimentaire regime;

    public Animal(EspeceAnimal espece, FamilleAnimal famille, RegimeAllimentaire regime) {
        this.espece = espece;
        this.famille = famille;
        this.regime = regime;
    }

    public EspeceAnimal getEspece() {
        return espece;
    }

    public FamilleAnimal getFamille() {
        return famille;
    }

    public RegimeAllimentaire getRegime() {
        return regime;
    }
}
