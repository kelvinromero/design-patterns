package iterator;

import grafo.dirigido.Aresta;
import grafo.dirigido.Vertice;

import java.util.*;

public class BFSIterator<T> implements IteratorInterface{

    private final List<Vertice<T>> vertices;
    private final List<Aresta<T>> edges;
    private final Queue<Vertice<T>> queue = new LinkedList<>();
    private final Set<Vertice<T>> visited = new HashSet<>();

    public BFSIterator(List<Vertice<T>> vertices, List<Aresta<T>> arestas, T id) {
        this.edges = arestas;
        this.vertices = vertices;
        Vertice<T> v = getVertice(id);

        if(v != null){
            this.queue.add(v);
            this.visited.add(v);
        } else {
            throw new NoSuchElementException();
        }

    }
    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Vertice<T> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Vertice<T> next = queue.remove();
        for (Vertice<T> adjacent : this.getAdjacent(next)){
            if(!this.visited.contains(adjacent)){
                this.queue.add(adjacent);
                this.visited.add(adjacent);
            }
        }
        return next;
    }

    private Vertice<T> getVertice(T data){

        for (Vertice<T> u : vertices) {
            if ( u.getCarga().equals( data ))
                return u;
        }
        return null;
    }

    private List<Vertice<T>> getAdjacent( Vertice<T> vertice ){
        List<Vertice<T>> vertex = new ArrayList<>();

        for(Aresta<T> arco: edges){
            if( arco.getOrigem().equals(vertice))
                vertex.add((Vertice<T>) arco.getDestino());
        }

        return vertex;
    }
}