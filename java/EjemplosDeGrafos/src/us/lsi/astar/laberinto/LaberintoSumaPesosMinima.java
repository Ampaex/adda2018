package us.lsi.astar.laberinto;


import us.lsi.astar.AStarGraph;
import us.lsi.graphs.*;

public class LaberintoSumaPesosMinima 
		extends SimpleVirtualGraph<Casilla, SimpleEdge<Casilla>> 
	implements AStarGraph<Casilla, SimpleEdge<Casilla>> {

	public LaberintoSumaPesosMinima(String nf, Integer nx, Integer ny, Casilla... c) {
		super(c);
	}

	@Override
	public double getVertexWeight(Casilla vertex) {
		return vertex.getInfo();
	}

}
