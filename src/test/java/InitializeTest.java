import nowipi.opengl.GraphicsContext;
import nowipi.opengl.OpenGL;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

final class InitializeTest {

    public static void main(String[] args) {
        OpenGL.init(new GraphicsContext() {
            @Override
            public void dispose() {

            }

            @Override
            public void makeCurrent() {

            }

            @Override
            public MethodHandle getMethodHandle(String methodName, FunctionDescriptor descriptor) {
                return null;
            }
        });

    }

}
