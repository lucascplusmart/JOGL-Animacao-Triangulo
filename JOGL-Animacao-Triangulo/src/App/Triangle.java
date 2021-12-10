package App;

// importes necessarios

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;


public class Triangle implements GLEventListener {

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2  gl = drawable.getGL().getGL2();

        gl.glBegin(GL2.GL_TRIANGLES);

        // topo
        // definindo a cor azul seguindo o padrão rgb
        gl.glColor3f(0.0f,0.0f,1.0f);
        gl.glVertex3f(0,0.50f,0);
        // base
        // definindo a cor vermelha seguindo o padrão rgb
        gl.glColor3f(1.0f,0.0f,0.0f);
        gl.glVertex3f(-0.50f,-0.50f,0);
        // lateral
        // definindo a cor verde seguindo o padrão rgb
        gl.glColor3f(0.0f,1.0f,0.0f);
        gl.glVertex3f(0.50f,-0.50f,0);
        gl.glEnd();
        gl.glFlush();

    }

    @Override
    public void dispose(GLAutoDrawable arg0) {
        //method body
    }

    @Override
    public void init(GLAutoDrawable arg0) {
        // method body
    }

    @Override
    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
        // method body
    }

}