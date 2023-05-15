package iterator;

import grafo.dirigido.Aresta;
import grafo.dirigido.Vertice;

import java.util.*;

public class DFSIterator<T> implements IteratorInterface{

        private final List<Vertice<T>> vertices;
        private final List<Aresta<T>> edges;
        private final Stack<Vertice<T>> stack = new Stack<>();
        private final Set<Vertice<T>> visited = new HashSet<>();

        public DFSIterator(List<Vertice<T>> vertices, List<Aresta<T>> edges, T data) {
            this.edges = edges;
            this.vertices = vertices;
            Vertice<T> v = getVertice(data);

            if(v != null){
                this.stack.add(v);
                this.visited.add(v);
            } else {
                throw new NoSuchElementException();
            }

        }
        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public Vertice<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Vertice<T> next = stack.pop();

            for (Vertice<T> adjacent : this.getAdjacent(next)){
                if(!this.visited.contains(adjacent)){
                    this.stack.add(adjacent);
                    this.visited.add(adjacent);
                }
            }

            return next;
        }

        private Vertice<T> getVertice(T carga){

            for (Vertice<T> u : vertices) {
                if ( u.getCarga().equals( carga ))
                    return u;
            }
            return null;
        }

        private List<Vertice<T>> getAdjacent(Vertice<T> vertice ){
            List<Vertice<T>> vertex = new ArrayList<>();

            for(Aresta<T> arco: edges){
                if( arco.getOrigem().equals(vertice))
                    vertex.add(arco.getDestino());
            }

            return vertex;
        }
}