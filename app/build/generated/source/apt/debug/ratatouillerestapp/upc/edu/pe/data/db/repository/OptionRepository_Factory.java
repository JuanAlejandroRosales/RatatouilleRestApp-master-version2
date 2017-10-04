package ratatouillerestapp.upc.edu.pe.data.db.repository;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.db.model.DaoSession;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OptionRepository_Factory implements Factory<OptionRepository> {
  private final Provider<DaoSession> daoSessionProvider;

  public OptionRepository_Factory(Provider<DaoSession> daoSessionProvider) {
    assert daoSessionProvider != null;
    this.daoSessionProvider = daoSessionProvider;
  }

  @Override
  public OptionRepository get() {
    return new OptionRepository(daoSessionProvider.get());
  }

  public static Factory<OptionRepository> create(Provider<DaoSession> daoSessionProvider) {
    return new OptionRepository_Factory(daoSessionProvider);
  }
}
