package org.gemoc.mocc.transformations.ecl2mtl.services;

public class FiacreArrayElement 
{
	protected String arrayname;
	protected String arraysize;
	protected String conceptname;
	
	public FiacreArrayElement(String aname, String size, String cname) 
	{
		arrayname = aname;
		arraysize = size;
		conceptname = cname;
	}
}
