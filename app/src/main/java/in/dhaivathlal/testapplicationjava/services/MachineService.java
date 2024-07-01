package in.dhaivathlal.testapplicationjava.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MachineService {

    private List<Machine> machines = new ArrayList<>();
    private static MachineService machineService = null;

    public static MachineService getInstance() {
        if(machineService == null)
            machineService = new MachineService();
        return machineService;
    }
    public void add(String name, String username, String ip, String password) {
        Machine machine = new Machine(name, username, ip, password);
        machines.add(machine);
    }

    public Stream<Machine> stream() {
        return machines.stream();
    }

    public Machine get(int i) {
        return machines.get(i);
    }
}
