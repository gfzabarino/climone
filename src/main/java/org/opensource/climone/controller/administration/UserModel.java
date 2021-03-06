package org.opensource.climone.controller.administration;

import org.opensource.climone.controller.AbstractModel;
import org.opensource.climone.entities.security.Role;
import org.opensource.climone.entities.security.User;
import org.opensource.climone.view.datamodel.DefaultSelectionDataModelListener;
import org.opensource.climone.view.datamodel.SelectableDataModel;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;

@Controller("userModel")
@Scope(value = "flow", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserModel extends AbstractModel<User> implements Cloneable {

	private static final long serialVersionUID = -4636891182800712837L;
	private String sortProperty;

	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private String confirmPassword;

	private SelectableDataModel<Role> rolesDataModel;
	private DefaultSelectionDataModelListener<Role> rolesSelectionListener;

	public UserModel() {
	}

	public String getSortProperty() {
		return sortProperty;
	}

	public void setSortProperty(String sortProperty) {
		this.sortProperty = sortProperty;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SelectableDataModel<Role> getRolesDataModel() {
		return rolesDataModel;
	}

	public void setRolesDataModel(SelectableDataModel<Role> rolesDataModel) {
		this.rolesDataModel = rolesDataModel;
	}

	public DefaultSelectionDataModelListener<Role> getRolesSelectionListener() {
		return rolesSelectionListener;
	}

	public void setRolesSelectionListener(DefaultSelectionDataModelListener<Role> rolesSelectionListener) {
		this.rolesSelectionListener = rolesSelectionListener;
	}
}
