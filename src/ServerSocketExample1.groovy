
/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 11/4/13
 * Time: 11:00 AM
 */

ServerSocket serverSocket = new ServerSocket(2575,5)

while (true) {
  serverSocket.accept { Socket socket ->
    // This is running in a new thread and the number of threads is limited by the backlog parameter in
    // ServerSocket constructor
    socket.withStreams { input, output ->
      println Thread.currentThread().name

      def w = new BufferedWriter(new OutputStreamWriter(output))
      def r = new BufferedReader(new InputStreamReader(input))

      String a = null
      while( a = r.readLine() ) {
        println "Socket Read: -> " + a

      }

      w.writeLine("<html><body><h1>Done with test</h1></body></html>")
      w.flush()
      Thread.sleep(3000)

    }

  }
}