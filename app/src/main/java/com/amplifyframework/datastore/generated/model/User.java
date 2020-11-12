package com.amplifyframework.datastore.generated.model;


import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/**
 * This is an auto generated class representing the User type in your schema.
 */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Users")
public final class User implements Model {
    public static final QueryField ID = field("id");
    public static final QueryField NAME = field("name");
    public static final QueryField EMAIL = field("email");
    public static final QueryField PHONE_NUMBER = field("phone_number");
    public static final QueryField APPLICATIONS = field("applications");
    public static final QueryField WISH_LIST = field("wish_list");
    private final @ModelField(targetType = "ID", isRequired = true)
    String id;
    private final @ModelField(targetType = "String", isRequired = true)
    String name;
    private final @ModelField(targetType = "String", isRequired = true)
    String email;
    private final @ModelField(targetType = "String", isRequired = true)
    String phone_number;
    private final @ModelField(targetType = "String")
    List<String> applications;
    private final @ModelField(targetType = "String")
    List<String> wish_list;

    private User(String id, String name, String email, String phone_number, List<String> applications, List<String> wish_list) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.applications = applications;
        this.wish_list = wish_list;
    }

    public static NameStep builder() {
        return new Builder();
    }

    /**
     * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
     * This is a convenience method to return an instance of the object with only its ID populated
     * to be used in the context of a parameter in a delete mutation or referencing a foreign key
     * in a relationship.
     *
     * @param id the id of the existing item this instance will represent
     * @return an instance of this model with only ID populated
     * @throws IllegalArgumentException Checks that ID is in the proper format
     */
    public static User justId(String id) {
        try {
            UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
        } catch (Exception exception) {
            throw new IllegalArgumentException(
                    "Model IDs must be unique in the format of UUID. This method is for creating instances " +
                            "of an existing object with only its ID field for sending as a mutation parameter. When " +
                            "creating a new object, use the standard builder method and leave the ID field blank."
            );
        }
        return new User(
                id,
                null,
                null,
                null,
                null,
                null
        );
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public List<String> getApplications() {
        return applications;
    }

    public List<String> getWishList() {
        return wish_list;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            User user = (User) obj;
            return ObjectsCompat.equals(getId(), user.getId()) &&
                    ObjectsCompat.equals(getName(), user.getName()) &&
                    ObjectsCompat.equals(getEmail(), user.getEmail()) &&
                    ObjectsCompat.equals(getPhoneNumber(), user.getPhoneNumber()) &&
                    ObjectsCompat.equals(getApplications(), user.getApplications()) &&
                    ObjectsCompat.equals(getWishList(), user.getWishList());
        }
    }

    @Override
    public int hashCode() {
        return new StringBuilder()
                .append(getId())
                .append(getName())
                .append(getEmail())
                .append(getPhoneNumber())
                .append(getApplications())
                .append(getWishList())
                .toString()
                .hashCode();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("User {")
                .append("id=" + String.valueOf(getId()) + ", ")
                .append("name=" + String.valueOf(getName()) + ", ")
                .append("email=" + String.valueOf(getEmail()) + ", ")
                .append("phone_number=" + String.valueOf(getPhoneNumber()) + ", ")
                .append("applications=" + String.valueOf(getApplications()) + ", ")
                .append("wish_list=" + String.valueOf(getWishList()))
                .append("}")
                .toString();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(id,
                name,
                email,
                phone_number,
                applications,
                wish_list);
    }

    public interface NameStep {
        EmailStep name(String name);
    }


    public interface EmailStep {
        PhoneNumberStep email(String email);
    }


    public interface PhoneNumberStep {
        BuildStep phoneNumber(String phoneNumber);
    }


    public interface BuildStep {
        User build();

        BuildStep id(String id) throws IllegalArgumentException;

        BuildStep applications(List<String> applications);

        BuildStep wishList(List<String> wishList);
    }


    public static class Builder implements NameStep, EmailStep, PhoneNumberStep, BuildStep {
        private String id;
        private String name;
        private String email;
        private String phone_number;
        private List<String> applications;
        private List<String> wish_list;

        @Override
        public User build() {
            String id = this.id != null ? this.id : UUID.randomUUID().toString();

            return new User(
                    id,
                    name,
                    email,
                    phone_number,
                    applications,
                    wish_list);
        }

        @Override
        public EmailStep name(String name) {
            Objects.requireNonNull(name);
            this.name = name;
            return this;
        }

        @Override
        public PhoneNumberStep email(String email) {
            Objects.requireNonNull(email);
            this.email = email;
            return this;
        }

        @Override
        public BuildStep phoneNumber(String phoneNumber) {
            Objects.requireNonNull(phoneNumber);
            this.phone_number = phoneNumber;
            return this;
        }

        @Override
        public BuildStep applications(List<String> applications) {
            this.applications = applications;
            return this;
        }

        @Override
        public BuildStep wishList(List<String> wishList) {
            this.wish_list = wishList;
            return this;
        }

        /**
         * WARNING: Do not set ID when creating a new object. Leave this blank and one will be auto generated for you.
         * This should only be set when referring to an already existing object.
         *
         * @param id id
         * @return Current Builder instance, for fluent method chaining
         * @throws IllegalArgumentException Checks that ID is in the proper format
         */
        public BuildStep id(String id) throws IllegalArgumentException {
            this.id = id;

            try {
                UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
            } catch (Exception exception) {
                throw new IllegalArgumentException("Model IDs must be unique in the format of UUID.",
                        exception);
            }

            return this;
        }
    }


    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String id, String name, String email, String phoneNumber, List<String> applications, List<String> wishList) {
            super.id(id);
            super.name(name)
                    .email(email)
                    .phoneNumber(phoneNumber)
                    .applications(applications)
                    .wishList(wishList);
        }

        @Override
        public CopyOfBuilder name(String name) {
            return (CopyOfBuilder) super.name(name);
        }

        @Override
        public CopyOfBuilder email(String email) {
            return (CopyOfBuilder) super.email(email);
        }

        @Override
        public CopyOfBuilder phoneNumber(String phoneNumber) {
            return (CopyOfBuilder) super.phoneNumber(phoneNumber);
        }

        @Override
        public CopyOfBuilder applications(List<String> applications) {
            return (CopyOfBuilder) super.applications(applications);
        }

        @Override
        public CopyOfBuilder wishList(List<String> wishList) {
            return (CopyOfBuilder) super.wishList(wishList);
        }
    }

}
