enum LightColour {
    Red{ public LightColour change() { return Green; } }, 
    Green{ public LightColour change() { return Yellow; } }, 
    Yellow{ public LightColour change() { return Red; } };
    public abstract LightColour change(); 
}

public class w8_TrafficLight {
    private LightColour colour;
    public w8_TrafficLight() {
        colour = LightColour.Red; //By default it is Red.
    }
    public LightColour change() { colour = colour.change(); return colour;
    } 
}
