package test.pivotal.pal.tracker.support;

/**
 *
 * @author 780449
 */
public class Response {

	/**
	 *
	 */
	public final int status;

	/**
	 *
	 */
	public final String body;

	/**
	 *
	 * @param body
	 * @param string
	 */
	public Response(int status, String body) {
        this.status = status;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", body='" + body + '\'' +
                '}';
    }
}
