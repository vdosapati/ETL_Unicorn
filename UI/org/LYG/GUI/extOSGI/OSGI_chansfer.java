package org.LYG.GUI.extOSGI;
import org.LYG.GUI.nodeEdit.Sort;
import org.LYG.GUI.nodeEdit.linkNode;
public class OSGI_chansfer {
	public OSGI_chansfer(linkNode node, linkNode first)
	{
		first=new Sort().sort(first);
		linkNode node1=new linkNode();
	    node1=first;
	    if(node1!=null)
	    {
			if(node.tbeconnect&&node.tbeconnectID==node1.ID&&node.tbeconnetName.equals(node1.name))
			{
                node.thisface.thisrun.toptablein=node1.thisface.thisview.tableout;
                node.thisface.thisrun.topgin=node1.thisface.thisview.gout;
        		node.thisface.thisrun.toplygin=node1.thisface.thisview.lygout;
				return;
			}
			if(node.mbeconnect&&node.mbeconnectID==node1.ID&&node.mbeconnetName.equals(node1.name))
			{
                node.thisface.thisrun.midtablein=node1.thisface.thisview.tableout;
                node.thisface.thisrun.midgin=node1.thisface.thisview.gout;
        		node.thisface.thisrun.midlygin=node1.thisface.thisview.lygout;
				return;
			}	
			if(node.dbeconnect&&node.dbeconnectID==node1.ID&&node.dbeconnetName.equals(node1.name))
			{
                node.thisface.thisrun.downtablein=node1.thisface.thisview.tableout;
                node.thisface.thisrun.downgin=node1.thisface.thisview.gout;
        		node.thisface.thisrun.downlygin=node1.thisface.thisview.lygout;
				return;
			}	
			while(node1.next!=null)
			{
				node1=node1.next;
				if(node.tbeconnect&&node.tbeconnectID==node1.ID&&node.tbeconnetName.equals(node1.name))
				{
	                node.thisface.thisrun.toptablein=node1.thisface.thisview.tableout;
	                node.thisface.thisrun.topgin=node1.thisface.thisview.gout;
	        		node.thisface.thisrun.toplygin=node1.thisface.thisview.lygout;
					return;
				}
				if(node.mbeconnect&&node.mbeconnectID==node1.ID&&node.mbeconnetName.equals(node1.name))
				{
	                node.thisface.thisrun.midtablein=node1.thisface.thisview.tableout;
	                node.thisface.thisrun.midgin=node1.thisface.thisview.gout;
	        		node.thisface.thisrun.midlygin=node1.thisface.thisview.lygout;
					return;
				}	
				if(node.dbeconnect&&node.dbeconnectID==node1.ID&&node.dbeconnetName.equals(node1.name))
				{
	                node.thisface.thisrun.downtablein=node1.thisface.thisview.tableout;
	                node.thisface.thisrun.downgin=node1.thisface.thisview.gout;
	        		node.thisface.thisrun.downlygin=node1.thisface.thisview.lygout;
					return;
				}
			}
	    }
	}
}
