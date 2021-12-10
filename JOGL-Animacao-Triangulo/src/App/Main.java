package App;


/*
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
 */

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);

       // canvas
       final GLCanvas glcanvas = new GLCanvas(capabilities);
        Triangle l = new Triangle();
        glcanvas.addGLEventListener(l);
        glcanvas.setSize(500, 500);

        //criando um frame
        final JFrame frame = new JFrame ("Triangle");

        //adicionando o canvas no frame
        frame.add(glcanvas);
        frame.setSize(500,400);
        frame.setVisible(true);

    }
}
