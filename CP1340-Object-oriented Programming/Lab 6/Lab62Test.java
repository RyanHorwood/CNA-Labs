import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class Galaxy extends JPanel {
        private static final int WINDOW_WIDTH = 600;
        private static final int WINDOW_HEIGHT = 600;

    public Galaxy() {
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        setBackground(Color.BLACK);
    }

    protected void paintComponent( Graphics g ) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.YELLOW);
        
        Ellipse2D a = new Ellipse2D.Double(300, 300, 40, 40);
        g2d.fill(a);
        g2d.setColor(Color.RED);
        
        Ellipse2D b = new Ellipse2D.Double(270, 335, 20, 20);
        g2d.fill(b);
        g2d.setColor(Color.BLUE);
        
        Ellipse2D c = new Ellipse2D.Double(440, 190, 23, 23);
        g2d.fill(c);
        g2d.setColor(Color.WHITE);
        
        Ellipse2D d = new Ellipse2D.Double(456, 240, 12, 12);
        g2d.fill(d);
    }

    public static void runApplication(JPanel app) {
        JFrame frame = new JFrame();
        frame.setSize(app.getPreferredSize());
        frame.setTitle(app.getClass().getName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(app);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Galaxy s = new Galaxy();
        runApplication(s);
    }
}
class Planet {
constructor(radius, distance, orbitspeed, angle) {
this.radius = radius;
this.distance = distance;
this.orbitspeed = orbitspeed;
this.angle = angle;
this.planets = [];
}

orbit() {
this.angle += this.orbitspeed;
for (let i in this.planets) {
this.planets[i].orbit();
}
}

spawnMoons(total, level) {
for (let i = 0; i < total; i++) {
let r = this.radius / (level * 2);
let d = random(50, 150);
let o = random(-0.1, 0.1);
let a = random(TWO_PI);
this.planets.push(new Planet(r, d / level, o, a));
if (level < 3) {
let num = Math.floor(random(0, 4));
this.planets[i].spawnMoons(num, level + 1);
}
}
}

show() {
push();
fill(255, 100);
rotate(this.angle);
translate(this.distance, 0);
ellipse(0, 0, this.radius * 2);
for (let i in this.planets) {
this.planets[i].show();
}
pop();
}
}
function setup() {
createCanvas(600, 600);
sun = new Planet(50, 0, 0, random(TWO_PI));
sun.spawnMoons(5, 1);
}

function draw() {
background(51);
translate(width / 2, height / 2);
sun.show();
sun.orbit();
}
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Solar System Generator</title>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/p5@1.4.0/lib/p5.min.js"></script>

<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/p5@1.4.0/lib/addons/p5.sound.min.js"></script>
<script type="text/javascript" src="sketch.js"></script>
<script type="text/javascript" src="planet.js"></script>
</head>
<body>
</body>
</html>