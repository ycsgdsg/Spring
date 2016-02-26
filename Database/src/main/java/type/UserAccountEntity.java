package type;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by chaoyuan on 02/24/2016.
 */
@Entity
@Table(name = "user_account", schema = "", catalog = "identity")
public class UserAccountEntity {
    private long userId;
    private String email;
    private Timestamp dob;
    private String password;
    private Timestamp dateCreated;
    private Timestamp dateModified;
    private short status;
    private Short statusReasonCode;
    private Short emailStatus;

    @Id
    @Column(name = "USER_ID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "DOB")
    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "DATE_CREATED")
    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Basic
    @Column(name = "DATE_MODIFIED")
    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    @Basic
    @Column(name = "STATUS")
    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "STATUS_REASON_CODE")
    public Short getStatusReasonCode() {
        return statusReasonCode;
    }

    public void setStatusReasonCode(Short statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
    }

    @Basic
    @Column(name = "EMAIL_STATUS")
    public Short getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Short emailStatus) {
        this.emailStatus = emailStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAccountEntity that = (UserAccountEntity) o;

        if (userId != that.userId) return false;
        if (status != that.status) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (dateModified != null ? !dateModified.equals(that.dateModified) : that.dateModified != null) return false;
        if (statusReasonCode != null ? !statusReasonCode.equals(that.statusReasonCode) : that.statusReasonCode != null)
            return false;
        if (emailStatus != null ? !emailStatus.equals(that.emailStatus) : that.emailStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (dateModified != null ? dateModified.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (statusReasonCode != null ? statusReasonCode.hashCode() : 0);
        result = 31 * result + (emailStatus != null ? emailStatus.hashCode() : 0);
        return result;
    }
}
