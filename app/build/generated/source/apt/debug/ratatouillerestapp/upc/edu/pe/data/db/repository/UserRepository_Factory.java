package ratatouillerestapp.upc.edu.pe.data.db.repository;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.db.model.DaoSession;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<DaoSession> daoSessionProvider;

  public UserRepository_Factory(Provider<DaoSession> daoSessionProvider) {
    assert daoSessionProvider != null;
    this.daoSessionProvider = daoSessionProvider;
  }

  @Override
  public UserRepository get() {
    return new UserRepository(daoSessionProvider.get());
  }

  public static Factory<UserRepository> create(Provider<DaoSession> daoSessionProvider) {
    return new UserRepository_Factory(daoSessionProvider);
  }
}
