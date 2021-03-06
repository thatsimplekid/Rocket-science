// Date: 10/12/2011 5:30:57 PM
// Java generated by Techne
// This is the first stage to more output options
// and therefore a very basic Render-File
// I hope it will be useful, in any case, leave
// feedback so I can improve on it
// - ZeuX
      package rocketScience;

import net.minecraft.src.*;

import org.lwjgl.opengl.GL11;

public class MissilePassengerRender extends RenderLiving
{

    public MissilePassengerRender(float f)
    {
        super(new MissilePassengerModel(), f);
    }

    public void renderMissileModel(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entityliving, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
        renderMissileModel(entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        renderMissileModel((EntityLiving)entity, d, d1, d2, f, f1);
    }
    
    protected void preRenderCallback(EntityLiving entityliving, float f)
    {
        GL11.glScalef(2, 2, 2);
    }
}
