package Main;

import java.util.Arrays;

public class Population {
  private Chromosome[] chromosomes;
  public Population(int length){
    chromosomes = new Chromosome[length];
  }
  public Population initializePopulation(){
    for (int x = 0; x < chromosomes.length; x++){
      chromosomes[x] = new Chromosome(GeneticAlgorithm.TARGET_CHROMOSOME.length).initializeChoromosome();
    }
    sortChromosomesByFitness();
    return this;
  }

  public Chromosome[] getChromosomes(){
    return chromosomes;
  }
  public void sortChromosomesByFitness(){
    Arrays.sort(chromosomes,(chromosomes1,chromosomes2)->{
      int flag =0;
    if (chromosomes1.getFitness()>chromosomes2.getFitness()) flag=-1;
    else if (chromosomes1.getFitness()<chromosomes2.getFitness()) flag = 1;
    return flag;
    });
  }

}