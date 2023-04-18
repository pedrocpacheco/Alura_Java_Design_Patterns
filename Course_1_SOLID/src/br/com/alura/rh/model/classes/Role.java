package br.com.alura.rh.model.classes;

public enum Role {

	ASSISTANT {
		@Override
		public Role getNextRole() {
			return ANALIST;
		}
	},
	ANALIST {
		@Override
		public Role getNextRole() {
			return SPECIALIST;
		}
	},
	SPECIALIST {
		@Override
		public Role getNextRole() {
			return MANAGER;
		}
	},
	MANAGER {
		@Override
		public Role getNextRole() {
			return MANAGER;
		}
	};

	public abstract Role getNextRole();

}
