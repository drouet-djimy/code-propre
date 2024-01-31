package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal(EspeceAnimal.Gazelle, FamilleAnimal.MAMMIFERE, RegimeAllimentaire.HERBIVORE));
		zoo.addAnimal(new Animal(EspeceAnimal.Zèbre, FamilleAnimal.MAMMIFERE, RegimeAllimentaire.HERBIVORE));
		zoo.addAnimal(new Animal(EspeceAnimal.Lion, FamilleAnimal.MAMMIFERE, RegimeAllimentaire.HERBIVORE));
		zoo.addAnimal(new Animal(EspeceAnimal.Panthère, FamilleAnimal.MAMMIFERE, RegimeAllimentaire.CARNIVORE));
		zoo.addAnimal(new Animal(EspeceAnimal.Requin_blanc, FamilleAnimal.POISSON, RegimeAllimentaire.HERBIVORE));
		zoo.addAnimal(new Animal(EspeceAnimal.Truite_dorée, FamilleAnimal.POISSON, RegimeAllimentaire.HERBIVORE));
		zoo.addAnimal(new Animal(EspeceAnimal.Boa_constrictor, FamilleAnimal.REPTIL, RegimeAllimentaire.CARNIVORE));
		zoo.addAnimal(new Animal(EspeceAnimal.Python, FamilleAnimal.REPTIL, RegimeAllimentaire.CARNIVORE));
	}

}
