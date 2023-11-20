const net = require('net');

const server = net.createServer((socket) => {
    console.log('Client connected');

    socket.on('data', (data) => {
        console.log(`Received from client: ${data}`);

        // Echo back the data to the client
        socket.write(data);
    });

    socket.on('end', () => {
        console.log('Client disconnected');
    });
});

const port = 8080;
server.listen(port, () => {
    console.log(`Server listening on port ${port}`);
});