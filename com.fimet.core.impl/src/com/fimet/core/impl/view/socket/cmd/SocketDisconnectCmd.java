package com.fimet.core.impl.view.socket.cmd;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.fimet.commons.utils.ViewUtils;
import com.fimet.core.impl.view.socket.SocketView;
/**
 * 
 * @author Marco A. Salazar
 * @email marcoasb99@ciencias.unam.mx
 *
 */
public class SocketDisconnectCmd extends AbstractHandler {
    public Object execute(ExecutionEvent event) throws ExecutionException {
    	SocketView view = (SocketView)ViewUtils.getViewById(SocketView.ID);
    	if (view != null) {
    		view.disconnectSelection();
    	}
        return null;
    }

}