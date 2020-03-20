package io.pivotal.pal.tracker.accounts.data;

/**
 *
 * @author 780449
 */
public class AccountRecord {

	/**
	 *
	 */
	public final long id;

	/**
	 *
	 */
	public final long ownerId;

	/**
	 *
	 */
	public final String name;

    private AccountRecord(Builder builder) {
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.name = builder.name;
    }

	/**
	 *
	 * @return
	 */
	public static Builder accountRecordBuilder() {
        return new Builder();
    }

	/**
	 *
	 */
	public static class Builder {
        private long id;
        private long ownerId;
        private String name;

		/**
		 *
		 * @return
		 */
		public AccountRecord build() {
            return new AccountRecord(this);
        }

			/**
			 *
			 * @param id
			 * @return
			 */
			public Builder id(long id) {
            this.id = id;
            return this;
        }

		/**
		 *
		 * @param ownerId
		 * @return
		 */
		public Builder ownerId(long ownerId) {
            this.ownerId = ownerId;
            return this;
        }

			/**
			 *
			 * @param name
			 * @return
			 */
			public Builder name(String name) {
            this.name = name;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountRecord that = (AccountRecord) o;

        if (id != that.id) return false;
        if (ownerId != that.ownerId) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (ownerId ^ (ownerId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AccountRecord{" +
            "id=" + id +
            ", ownerId=" + ownerId +
            ", name='" + name + '\'' +
            '}';
    }
}
