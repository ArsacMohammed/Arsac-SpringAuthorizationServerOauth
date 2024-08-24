Notes:
Make sure if localhost is used for both client and auth server then add these in /etc/hosts 
-auth.localhost 127.0.0.1
-client.localhost 127.0.0.1
Because using localhost for both servive can cause overwritten of the browser cookie which cause authourization request not found due to passing of anonymous user to the client server 


