/*
 * This file is made available under the terms of the LGPL licence.
 * This licence can be retreived from http://www.gnu.org/copyleft/lesser.html.
 * The source remains the property of the YAWL Group.  The YAWL Group is a collaboration of 
 * individuals and organiations who are commited to improving workflow technology.
 *
 */

package com.nexusbpm.editor.desktop;

import java.awt.Point;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

import javax.swing.JDesktopPane;
import javax.swing.tree.TreeNode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import au.edu.qut.yawl.elements.YAtomicTask;
import au.edu.qut.yawl.elements.YNet;

import com.nexusbpm.editor.WorkflowEditor;
import com.nexusbpm.editor.persistence.EditorDataProxy;
import com.nexusbpm.editor.tree.DragAndDrop;
import com.nexusbpm.editor.tree.SharedNode;

/**
 * The Capsela desktop, where all component editors are displayed.
 * 
 * @author catch23
 */
public class DesktopPane extends JDesktopPane implements DropTargetListener {

  private static final Log LOG = LogFactory.getLog( DesktopPane.class );

    /**
     * Default constructor.
     */
    public DesktopPane() {
        super();
        new DropTarget( this, this );
    }

    /**
     * @see DropTargetListener#dropActionChanged(DropTargetDragEvent)
     */
    public void dropActionChanged( DropTargetDragEvent event ) {
    }

    /**
     * @see DropTargetListener#dragEnter(DropTargetDragEvent)
     */
    public void dragEnter( DropTargetDragEvent event ) {
    }

    /**
     * @see DropTargetListener#dragExit(DropTargetEvent)
     */
    public void dragExit( DropTargetEvent event ) {
        DragAndDrop.setMouseCursorToRejectDrop();
    }

    /**
     * @see DropTargetListener#dragOver(DropTargetDragEvent)
     */
    public void dragOver( DropTargetDragEvent event ) {
        TreeNode draggingNode = DragAndDrop.getDraggingNode();
        if( isDropAcceptable( draggingNode ) ) {
            event.acceptDrag( DnDConstants.ACTION_MOVE );
            DragAndDrop.setMouseCursorToAcceptDropForMove();
        }
        else {
            event.rejectDrag();
            DragAndDrop.setMouseCursorToRejectDrop();
        }
    }

    /**
     * Returns <code>true</code> if the specified <code>ComponentNode</code> may
     * be dropped on the desktop.
     */
    private boolean isDropAcceptable( TreeNode draggingNode ) {
        if( draggingNode instanceof SharedNode ) {
            return ( (SharedNode) draggingNode ).getProxy().getData() instanceof YNet || ( (SharedNode) draggingNode ).getProxy().getData() instanceof YAtomicTask;
        }
        else
            return false;
    }

    /**
     * Method to handle drop events. Dropping a component node on the desktop
     * opens the editor for the node's component.
     * 
     * @see DropTargetListener#drop(DropTargetDropEvent)
     */
    public void drop( DropTargetDropEvent event ) {
        TreeNode draggingNode = DragAndDrop.getDraggingNode();
        if( isDropAcceptable( draggingNode ) ) {
            Point location = event.getLocation();
            EditorDataProxy dp = (EditorDataProxy) ( (SharedNode) draggingNode ).getProxy();

            try {
                WorkflowEditor.getInstance().openComponentEditor( dp, location );
            }
            catch( Exception e ) {
                LOG.error( "Error opening editor!", e );
            }
        }
    }
}
