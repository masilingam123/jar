package pom;

public class Pom {
			public String PostURL ="https://api.github.com/user/repos";
			public String bearer = "Bearer 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";
			public String auth = "Authorization";
			public String user ="masilingam123";
			public String repo ="masi";
			private String name;
			private String description;
			private String homepage;
			private boolean has_private;
			private boolean has_issues;
			private boolean has_projects;
			private boolean has_wiki;


			 // Getter Methods 

			 public String getName() {
			  return name;
			 }

			 public String getDescription() {
			  return description;
			 }

			 public String getHomepage() {
			  return homepage;
			 }

			 public boolean getPrivate() {
			  return has_private;
			 }

			 public boolean getHas_issues() {
			  return has_issues;
			 }

			 public boolean getHas_projects() {
			  return has_projects;
			 }

			 public boolean getHas_wiki() {
			  return has_wiki;
			 }

			 // Setter Methods 

			 public void setName(String name) {
			  this.name = name;
			 }

			 public void setDescription(String description) {
			  this.description = description;
			 }

			 public void setHomepage(String homepage) {
			  this.homepage = homepage;
			 }

			 public void setPrivate(boolean has_private) {
			  this.has_private = has_private;
			 }

			 public void setHas_issues(boolean has_issues) {
			  this.has_issues = has_issues;
			 }

			 public void setHas_projects(boolean has_projects) {
			  this.has_projects = has_projects;
			 }

			 public void setHas_wiki(boolean has_wiki) {
			  this.has_wiki = has_wiki;
			 }
			 
			
			 
	}




