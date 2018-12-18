package edu.neu.coe.info6205.final_project;

public class Edge implements Comparable<Edge>{

	private final int v, w;
	private final int weight;
	public Edge(int v, int w, int weight)
	{
		this.v=v;
		this.w= w;
		this.weight = weight;
	}
	
	int either()
	{
		return v;
	}
	
	int other(int vertex)
	{
		if(vertex==v) return w;
		else return v;
	}
	
	public int compareTo(Edge that)
	{
		if(this.weight<that.weight) return -1;
		else if(this.weight>that.weight) return 1;
		else return 0;
	}
	
	public int W()
	{
		return weight;
	}
	
}
