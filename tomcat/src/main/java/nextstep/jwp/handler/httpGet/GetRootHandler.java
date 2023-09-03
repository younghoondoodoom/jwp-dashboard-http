package nextstep.jwp.handler.httpGet;

import org.apache.coyote.Handler;
import org.apache.coyote.http11.StatusCode;
import org.apache.coyote.http11.request.ContentType;
import org.apache.coyote.http11.request.Http11Request;
import org.apache.coyote.http11.response.Http11Response;

public class GetRootHandler implements Handler {

    @Override
    public Http11Response resolve(final Http11Request request) {
        return new Http11Response(StatusCode.OK, ContentType.HTML, "Hello world!");
    }
}
