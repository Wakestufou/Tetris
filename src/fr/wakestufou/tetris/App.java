package fr.wakestufou.tetris;

import javax.swing.JButton;
import javax.swing.JFrame;

class App {
    public static void main(String[] args) {
        App app = new App();
        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        JButton button = new JButton("Click me");
        button.addActionListener(action -> {
            app.stop();
        });
        frame.getContentPane().add(button);

        app.run();
    }

    private Boolean isRunning = true;

    public void run() {
        int i = 0;
        while (isRunning) {
            System.out.println(i++);
            for (int j = 0; j < i; j++) {
                waitOneTick();                
            }
        }
    }

    public void stop() {
        isRunning = false;
    }

    public void waitOneTick() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}