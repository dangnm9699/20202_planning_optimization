import com.google.ortools.Loader;
import implement.XepLichThiSolverImpl;
import implement.dangnm.XepLichThiCBLS;
import implement.dangnm.XepLichThiChocoSolver;
import implement.dangnm.XepLichThiOrTools;
import implement.tuanbm.BackTracking;
import implement.tuanbm.LinearSolver;

public class App {
    /**
     * Data generator for {@link XepLichThiSolverImpl}
     * @param output output filename
     */
    public static void dataGenerator(String output) {
        //TODO: write data generator
    }

    /**
     * Main
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Loader.loadNativeLibraries();

        int option = 4;
        String data = "/data1.txt";
        XepLichThiSolverImpl solver = null;

        switch (option) {
            case 0:
                solver = new XepLichThiChocoSolver(data);
                break;
            case 1:
                solver = new XepLichThiOrTools(data);
                break;
            case 2:
                solver = new BackTracking(data);
                break;
            case 3:
                solver = new LinearSolver(data);
                break;
            case 4:
                solver = new XepLichThiCBLS(data);
                break;
            default:
                System.out.println("Invalid option! Stop program");
                System.exit(9699);
        }

        solver.solve();
        solver.printSolution();
    }
}
