package org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.presentation;

import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class SharedIcons {

	public static ImageDescriptor CONCURRENT_XDSMLMODELFILE_ICON = ImageDescriptor.createFromFile(SharedIcons.class, "/icons/full/obj16/Concurrent_xdsmlModelFile.gif");
	
	static HashMap<ImageDescriptor, Image> imageMap = new HashMap<ImageDescriptor, Image>();
	
	static public Image getSharedImage(ImageDescriptor descriptor){
		Image res = imageMap.get(descriptor);
		if(res == null){
			res = descriptor.createImage();
			imageMap.put(descriptor, res);
		}
		return res;
	}
}
