public class ServerManager {
    private ScheduleServer ScheduleServer;

    public ServerManager(ScheduleServer ScheduleServer) {
        this.ScheduleServer = ScheduleServer;
    }

    public void StartServer(){
        ScheduleServer.startBooting();
        ScheduleServer.readSystemConfigFile();
        ScheduleServer.init();
        ScheduleServer.initializeContext();
        ScheduleServer.initializeListeners();
        ScheduleServer.createSystemObjects();

    }

    public void StopServer(){
        ScheduleServer.releaseProcesses();
        ScheduleServer.destory();
        ScheduleServer.destroySystemObjects();
        ScheduleServer.destoryListeners();
        ScheduleServer.destoryContext();
        ScheduleServer.shutdown();
    }
}
