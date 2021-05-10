package serenno.bot;

import com.google.protobuf.ByteString;
import reactor.core.publisher.Flux;
import reactor.netty.ByteBufFlux;
import reactor.netty.http.client.HttpClient;
import serenno.protos.authGuestRequest.AuthGuestRequest;
import serenno.protos.authGuestResponse.AuthGuestResponse;
import serenno.protos.playerProfileRequest.PlayerProfileRequest;
import serenno.protos.playerProfileResponse.PlayerArenaStatus;
import serenno.protos.playerProfileResponse.PlayerArenaType;
import serenno.protos.playerProfileResponse.PlayerProfileResponse;
import serenno.protos.requestEnvelope.AcceptEncoding;
import serenno.protos.requestEnvelope.RequestEnvelope;
import serenno.protos.responseEnvelope.ResponseCode;
import serenno.protos.responseEnvelope.ResponseEnvelope;
import serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaProfileResponse;
import serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus;
import serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaType;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.zip.GZIPInputStream;

public class Bot {

    public void main() {
        /*final String token = args[0];
        final DiscordClient client = DiscordClient.create(token);

        client.withGateway(gateway -> {
            final Publisher<?> pingPong = gateway.on(MessageCreateEvent.class, event ->
                    Mono.just(event.getMessage())
                            .filter(message -> "!ping".equals(message.getContent()))
                            .flatMap(Message::getChannel)
                            .flatMap(channel -> channel.createMessage("Pong!")));

            final Publisher<?> onDisconnect = gateway.onDisconnect()
                    .doOnTerminate(() -> System.out.println("Disconnected!"));

            return Mono.when(pingPong, onDisconnect);
        }).block();*/

    }

    public void test() {
//        System.setProperty("https.proxyHost", "192.168.178.24");
//        System.setProperty("https.proxyPort", "8080");

        String str = HttpClient.create()             // Prepares a HTTP client for configuration.
                /*.tcpConfiguration(tcpClient -> tcpClient
                .proxy(proxy -> proxy
                .type(ProxyProvider.Proxy.HTTP)
                .host("192.168.178.24")
                .port(8080)))*/
                //.port(server.port())  // Obtain the server's port and provide it as a port to which this
                // client should connect.
                .wiretap(true)            // Applies a wire logger configuration.
                .headers(h -> h.add("Content-Type", "application/x-protobuf")) // Adds headers to the HTTP request.
                .headers(h -> h.add("Connection", "Keep-Alive"))
                .headers(h -> h.add("Accept-Encoding", "gzip"))
                .headers(h -> h.add("Accept-Type", "application/x-protobuf"))
                .post()              // Specifies that POST method will be used.
                .uri("https://swprod.capitalgames.com/rpc")  // Specifies the path.
                .send(ByteBufFlux.fromString(Flux.just("Hello")))  // Sends the request body.
                .responseContent()   // Receives the response body.
                .aggregate()
                .asString()
                .block();

        System.out.println(str);
    }

    void test2() {
        try {
            /*ByteString auth = getAuthGuestRequest();
            byte[] body = getRequestEnvelope("AuthRpc", "DoAuthGuest", auth, null);
            basicPostRequest(body);*/
            //AuthGuestResponse authObj = getGuestAuth();
            System.out.println(Instant.now());
            PlayerArena flup = getPlayerArenaRanksExperimental("275764131");
            System.out.println(Instant.now());
            PlayerArena twinkOen = getPlayerArenaRanksExperimental("774162493");
            System.out.println(Instant.now());
            PlayerArena miniFlup = getPlayerArenaRanksExperimental("587821918");
            System.out.println(Instant.now());
            System.out.println("HELLO");
        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }

    }

    private byte[] getRequestEnvelope(String serviceName, String methodName, ByteString payload, AuthGuestResponse authObj) throws IOException {
        RequestEnvelope.Builder reqEnvBuilder = RequestEnvelope.newBuilder();
        reqEnvBuilder.setCorrelationId(0);
        reqEnvBuilder.setServiceName(serviceName);
        reqEnvBuilder.setMethodName(methodName);
        if (authObj != null) {
            reqEnvBuilder.setAuthId(authObj.getAuthId());
            reqEnvBuilder.setAuthToken(authObj.getAuthToken());
        }
        if (payload != null) {
            reqEnvBuilder.setPayload(payload);
        }
        reqEnvBuilder.setClientVersion(742101);
        Date date = new Date();
        long clientStartupTime = date.getTime() / 1000 - 10;
        reqEnvBuilder.setClientStartupTimestamp(clientStartupTime);
        reqEnvBuilder.setPlatform("Android");
        reqEnvBuilder.setRegion("ROW");
        reqEnvBuilder.setClientExternalVersion("0.23.0");
        reqEnvBuilder.setClientInternalVersion("0.23.742101");
        reqEnvBuilder.setRequestId(UUID.randomUUID().toString().toLowerCase());
        reqEnvBuilder.setAcceptEncoding(AcceptEncoding.forNumber(1));
        long currentClientTime = clientStartupTime + 8;
        reqEnvBuilder.setCurrentClientTime(currentClientTime);
        reqEnvBuilder.setNimbleSessionId("202105051550302425432626");
        reqEnvBuilder.setTimezone("CEST");
        reqEnvBuilder.setCarrier("310410");
        reqEnvBuilder.setNetworkAccess("W");
        reqEnvBuilder.setHardwareId("2363");
        reqEnvBuilder.setAndroidId("9001048633645127");
        reqEnvBuilder.setSynergyId("15510062413");
        reqEnvBuilder.setDeviceModel("samsung SM-A908N");
        reqEnvBuilder.setDeviceId("c045fcab5ca5b29de2cafb4cf109cacb6b76c8f221bb318b2cba007a5a35f987");
        RequestEnvelope reqEnv = reqEnvBuilder.build();
        return reqEnv.toByteArray();
    }

    private byte[] getRequestEnvelopeExperimental(String serviceName, String methodName, ByteString payload) throws IOException {
        RequestEnvelope.Builder reqEnvBuilder = RequestEnvelope.newBuilder();
        reqEnvBuilder.setCorrelationId(0);
        reqEnvBuilder.setServiceName(serviceName);
        reqEnvBuilder.setMethodName(methodName);if (payload != null) {
            reqEnvBuilder.setPayload(payload);
        }
        reqEnvBuilder.setClientVersion(742101);
        Date date = new Date();
        long clientStartupTime = date.getTime() / 1000 - 10;
        reqEnvBuilder.setClientStartupTimestamp(clientStartupTime);
        reqEnvBuilder.setPlatform("Android");
        reqEnvBuilder.setRegion("ROW");
        reqEnvBuilder.setClientExternalVersion("0.23.0");
        reqEnvBuilder.setClientInternalVersion("0.23.742101");
        reqEnvBuilder.setRequestId(UUID.randomUUID().toString().toLowerCase());
        reqEnvBuilder.setAcceptEncoding(AcceptEncoding.forNumber(1));
        long currentClientTime = clientStartupTime + 8;
        reqEnvBuilder.setCurrentClientTime(currentClientTime);
        reqEnvBuilder.setNimbleSessionId("202105051550302425432626");
        reqEnvBuilder.setTimezone("CEST");
        reqEnvBuilder.setCarrier("310410");
        reqEnvBuilder.setNetworkAccess("W");
        reqEnvBuilder.setHardwareId("2363");
        reqEnvBuilder.setAndroidId("9001048633645127");
        reqEnvBuilder.setSynergyId("15510062413");
        reqEnvBuilder.setDeviceModel("samsung SM-A908N");
        reqEnvBuilder.setDeviceId("c045fcab5ca5b29de2cafb4cf109cacb6b76c8f221bb318b2cba007a5a35f987");
        RequestEnvelope reqEnv = reqEnvBuilder.build();
        return reqEnv.toByteArray();
    }

    private String getRandomUid() {
        return UUID.randomUUID().toString().toLowerCase().replaceAll("-", "").substring(0, 32);
    }

    private ByteString getAuthGuestRequest() {
        AuthGuestRequest.Builder authBuilder = AuthGuestRequest.newBuilder();
        authBuilder.setUid(getRandomUid());
        authBuilder.setDevicePlatform("Android");
        authBuilder.setLanguage("de");
        authBuilder.setPlayerName("");
        authBuilder.setBundleId("com.ea.game.starwarscapital_row");
        authBuilder.setRegion("ROW");
        authBuilder.setLocalTimeZoneOffsetMinutes(480);
        AuthGuestRequest auth = authBuilder.build();
        return auth.toByteString();
    }

    public AuthGuestResponse getGuestAuth() throws IOException {
        ByteString auth = getAuthGuestRequest();
        byte[] body = getRequestEnvelope("AuthRpc", "DoAuthGuest", auth, null);
        byte[] is = basicPostRequest(body);
        ResponseEnvelope responseEnvelope = ResponseEnvelope.newBuilder().mergeFrom(is).build();
        byte[] unzipped = extractZip(responseEnvelope.getPayload().toByteArray());
        return AuthGuestResponse.parseFrom(unzipped);
    }

    public PlayerArena getPlayerArenaRanks(String allyCode) throws IOException {
        PlayerProfileRequest.Builder playerBuilder = PlayerProfileRequest.newBuilder();
        playerBuilder.setPlayerId("");
        playerBuilder.setAllyCode(allyCode.replaceAll("-", ""));
        PlayerProfileRequest playerRequest = playerBuilder.build();
        byte[] body = getRequestEnvelope("PlayerRpc", "GetPlayerProfile", playerRequest.toByteString(), getGuestAuth());
        byte[] is = basicPostRequest(body);
        ResponseEnvelope responseEnvelope = ResponseEnvelope.parseFrom(is);
        if (responseEnvelope.getCode() != ResponseCode.OK) {
            System.out.println("Hallo");
        }
        byte[] unzipped = extractZip(responseEnvelope.getPayload().toByteArray());
        PlayerProfileResponse playerProfil = PlayerProfileResponse.parseFrom(unzipped);
        List<PlayerArenaStatus> arenaStatusesList = playerProfil.getArenasList();
        PlayerArenaStatus squadPlace = arenaStatusesList.stream().filter(playerArenaStatus -> PlayerArenaType.SquadArena == playerArenaStatus.getArenaType()).findAny().orElse(null);
        PlayerArenaStatus fleetPlace = arenaStatusesList.stream().filter(playerArenaStatus -> PlayerArenaType.FleetArena == playerArenaStatus.getArenaType()).findAny().orElse(null);
        PlayerArena playerArena = new PlayerArena();
        playerArena.playerName = playerProfil.getName();
        playerArena.allyCode = allyCode;
        playerArena.squadPlace = getPlaceOrZero(squadPlace);
        playerArena.fleetPlace = getPlaceOrZero(fleetPlace);
        return playerArena;
    }

    public PlayerArena getPlayerArenaRanksExperimental(String allyCode) throws IOException {
        PlayerProfileRequest.Builder playerBuilder = PlayerProfileRequest.newBuilder();
        playerBuilder.setPlayerId("");
        playerBuilder.setAllyCode(allyCode.replaceAll("-", ""));
        PlayerProfileRequest playerRequest = playerBuilder.build();
        byte[] body = getRequestEnvelopeExperimental("PlayerRpc", "GetPlayerArenaProfile", playerRequest.toByteString());
        byte[] is = basicPostRequest(body);
        ResponseEnvelope responseEnvelope = ResponseEnvelope.parseFrom(is);
        if (responseEnvelope.getCode() != ResponseCode.OK) {
            System.out.println("Hallo");
        }
        byte[] unzipped = extractZip(responseEnvelope.getPayload().toByteArray());
        SlimPlayerArenaProfileResponse playerProfil = SlimPlayerArenaProfileResponse.parseFrom(unzipped);
        List<SlimPlayerArenaStatus> arenaStatusesList = playerProfil.getArenasList();
        SlimPlayerArenaStatus squadPlace = arenaStatusesList.stream().filter(slimPlayerArenaStatus -> slimPlayerArenaStatus.getArenaType() == SlimPlayerArenaType.SquadArena).findAny().orElse(null);
        SlimPlayerArenaStatus fleetPlace = arenaStatusesList.stream().filter(slimPlayerArenaStatus -> slimPlayerArenaStatus.getArenaType() == SlimPlayerArenaType.FleetArena).findAny().orElse(null);
        PlayerArena playerArena = new PlayerArena();
        playerArena.playerName = playerProfil.getName();
        playerArena.allyCode = allyCode;
        playerArena.squadPlace = getPlaceOrZeroExperimental(squadPlace);
        setPlayerArena(playerArena, playerProfil.getPvpOffset(), SlimPlayerArenaType.SquadArena);
        playerArena.fleetPlace = getPlaceOrZeroExperimental(fleetPlace);
        setPlayerArena(playerArena, playerProfil.getPvpOffset(), SlimPlayerArenaType.FleetArena);
        return playerArena;
    }

    public void setPlayerArena(PlayerArena playerArena, int pvpOffset, SlimPlayerArenaType arenaType) {
        Instant utcTime = Instant.now();
        boolean squadArena = arenaType == SlimPlayerArenaType.SquadArena;
        int defaultPoHour = squadArena ? 18 : 19;
        LocalDateTime now = LocalDateTime.ofInstant(utcTime, ZoneOffset.UTC);
        LocalDateTime defaultPoTime = LocalDateTime.ofInstant(utcTime, ZoneOffset.UTC).withHour(defaultPoHour).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime poTimeTemp = defaultPoTime.minusMinutes(pvpOffset);
        LocalDateTime poTime = poTimeTemp.compareTo(now) > 0 ? poTimeTemp : poTimeTemp.plusHours(24);

        LocalDateTime tempDateTime;
        tempDateTime = LocalDateTime.from(now);
        int hours = (int)tempDateTime.until(poTime, ChronoUnit.HOURS);
        tempDateTime = tempDateTime.plusHours(hours);
        int minutes = (int)tempDateTime.until(poTime, ChronoUnit.MINUTES);

        if (squadArena) {
            playerArena.squadHourOfPo = poTime.getHour();
            playerArena.squadHourToPo = hours;
            playerArena.squadMinutesOfPo = poTime.getMinute();
            playerArena.squadMinutesToPo = minutes;
        } else {
            playerArena.fleetHourOfPo = poTime.getHour();
            playerArena.fleetHourToPo = hours;
            playerArena.fleetMinutesOfPo = poTime.getMinute();
            playerArena.fleetMinutesToPo = minutes;
        }
    }

    public PlayerArena getPlayerArenaRanks(String allyCode, AuthGuestResponse authObj) throws IOException {
        PlayerProfileRequest.Builder playerBuilder = PlayerProfileRequest.newBuilder();
        playerBuilder.setPlayerId("");
        playerBuilder.setAllyCode(allyCode.replaceAll("-", ""));
        PlayerProfileRequest playerRequest = playerBuilder.build();
        byte[] body = getRequestEnvelope("PlayerRpc", "GetPlayerProfile", playerRequest.toByteString(), authObj);
        byte[] is = basicPostRequest(body);
        ResponseEnvelope responseEnvelope = ResponseEnvelope.parseFrom(is);
        if (responseEnvelope.getCode() != ResponseCode.OK) {
            System.out.println("Hallo");
        }
        byte[] unzipped = extractZip(responseEnvelope.getPayload().toByteArray());
        byte[] test = responseEnvelope.getPayload().toByteArray();
        PlayerProfileResponse playerProfil = PlayerProfileResponse.parseFrom(unzipped);
        List<PlayerArenaStatus> arenaStatusesList = playerProfil.getArenasList();
        PlayerArenaStatus squadPlace = arenaStatusesList.stream().filter(playerArenaStatus -> PlayerArenaType.SquadArena == playerArenaStatus.getArenaType()).findAny().orElse(null);
        PlayerArenaStatus fleetPlace = arenaStatusesList.stream().filter(playerArenaStatus -> PlayerArenaType.FleetArena == playerArenaStatus.getArenaType()).findAny().orElse(null);
        PlayerArena playerArena = new PlayerArena();
        playerArena.playerName = playerProfil.getName();
        playerArena.allyCode = allyCode;
        playerArena.squadPlace = getPlaceOrZero(squadPlace);
        playerArena.fleetPlace = getPlaceOrZero(fleetPlace);
        return playerArena;
    }

    private int getPlaceOrZero(PlayerArenaStatus status) {
        return Optional.ofNullable(status)
                .map(PlayerArenaStatus::getPlace)
                .orElse(0);
    }

    private int getPlaceOrZeroExperimental(SlimPlayerArenaStatus status) {
        return Optional.ofNullable(status)
                .map(SlimPlayerArenaStatus::getPlace)
                .orElse(0);
    }

    private byte[] basicPostRequest(byte[] bytes) throws IOException {
        //System.setProperty("https.proxyHost", "192.168.178.24");
        //System.setProperty("https.proxyPort", "8080");

        URL url = new URL("https://swprod.capitalgames.com/rpc");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/x-protobuf");
        con.setRequestProperty("Connection", "Keep-Alive");
        con.setRequestProperty("Accept-Encoding", "gzip");
        con.setRequestProperty("Accept-Type", "application/x-protobuf");
        con.setDoOutput(true);
        int length = bytes.length;
        con.setFixedLengthStreamingMode(length);
        con.connect();
        try(OutputStream os = con.getOutputStream()) {
            os.write(bytes);
        }
        /*InputStream is = con.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();
        return response.toString();*/
        int responseCode = con.getResponseCode();

        System.out.println("Response Code : " + responseCode);

        InputStream is = con.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[512];
        while (true) {
            int len = is.read(buf);
            if (len == -1) {
                break;
            }
            baos.write(buf, 0, len);
        }
        byte[] out = baos.toByteArray();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        System.out.println(response.toString());
        return out;
    }

    private void basicPostRequest2(byte[] body) throws IOException {
        HttpClient client = HttpClient.create();
        Response responseObj = client.headers(h -> h.add("Content-Type", "application/x-protobuf")) // Adds headers to the HTTP request.
                .headers(h -> h.add("Connection", "Keep-Alive"))
                .headers(h -> h.add("Accept-Encoding", "gzip"))
                .headers(h -> h.add("Accept-Type", "application/x-protobuf"))
                .post()              // Specifies that POST method will be used.
                .uri("https://swprod.capitalgames.com/rpc")  // Specifies the path.
                .send(ByteBufFlux.fromString(Flux.just(Arrays.toString(body))))  // Sends the request body.
                .responseSingle(
                        (response, bytes) ->
                                bytes.asString()
                                        .map(it -> new Response(response.status().code(), it))
                ).block();
        System.out.println(responseObj);
    }

    public byte[] extractZip(byte[] bytes) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ByteArrayInputStream in = new ByteArrayInputStream(bytes);
            GZIPInputStream gis = new GZIPInputStream(in);
            byte[] buffer = new byte[2048];
            int len;
            while((len = gis.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
            os.close();
            gis.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return os.toByteArray();
    }
}
