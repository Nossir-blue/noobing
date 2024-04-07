import java.util.ArrayList;
import java.util.List;

// Iterador
interface Iterator {
    boolean hasNext(); // variável que identifica se há um elemento à seguir
    int next(); // pega o valor à seguir
}

// Agregado
interface Aggregate {
    Iterator createIterator(); // criar um iterator da classe interface
    int getElement(int index); // pega a posição de um determinado elemento
    int getSize(); // pega o tamanho da lista
}

// Iterador Concreto
class ConcreteIterator implements Iterator {
    private Aggregate aggregate; // atributo aggretate é do tipo da interface aggregate, acumula dados
    private int current; // pega a posição actual da lista

    ConcreteIterator(Aggregate agg) {
        aggregate = agg; // o atributo aggregate recebe o valor do parámetro
        current = 0; // a posição actual começa em zero
    }

    public boolean hasNext() { // método que confirma se há mais elementos a serem iterados
        return current < aggregate.getSize(); // a posição à seguir deve ser maior que a actual
    }

    public int next() { //este pega apenas a posição à seguir
        return aggregate.getElement(current++); // retorna o valos da posição à seguir
    }
}

// Agregado Concreto
class ConcreteAggregate implements Aggregate {
    private List<Integer> elements; // variável do tipo lista inteiro privado, elementos

    ConcreteAggregate() {
        elements = new ArrayList<>();
    }

    public Iterator createIterator() {// método que vai navegar pela lista
        return new ConcreteIterator(this); // passa o objecto actual do concreteaggregate como parâmetro da nova instância
    }

    public int getElement(int index) { // pega o elemento de uma posição
        return elements.get(index); // mostra o retorno do valor da posição e passa para o elemento
    }

    public int getSize() { // pega o tamanho da lista
        return elements.size(); // retorna o tamanho da lista
    }

    public void addElement(int element) { // adiciona elementos
        elements.add(element);
    }
}

public class App {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate(); // cria uma instância da classe concrete aggregate
        aggregate.addElement(1);
        aggregate.addElement(2);
        aggregate.addElement(3);

        Iterator iterator = aggregate.createIterator(); // atribui o método que permite navegar pela lista

        while (iterator.hasNext()) { // enquanto haver elementos à seguir
            System.out.print(iterator.next() + " "); //mostrar o valor da posição
        }
    }
}