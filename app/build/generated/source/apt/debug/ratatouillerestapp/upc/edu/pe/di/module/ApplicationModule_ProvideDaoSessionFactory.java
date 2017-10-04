package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.db.DbOpenHelper;
import ratatouillerestapp.upc.edu.pe.data.db.model.DaoSession;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideDaoSessionFactory implements Factory<DaoSession> {
  private final ApplicationModule module;

  private final Provider<DbOpenHelper> dbOpenHelperProvider;

  public ApplicationModule_ProvideDaoSessionFactory(
      ApplicationModule module, Provider<DbOpenHelper> dbOpenHelperProvider) {
    assert module != null;
    this.module = module;
    assert dbOpenHelperProvider != null;
    this.dbOpenHelperProvider = dbOpenHelperProvider;
  }

  @Override
  public DaoSession get() {
    return Preconditions.checkNotNull(
        module.provideDaoSession(dbOpenHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DaoSession> create(
      ApplicationModule module, Provider<DbOpenHelper> dbOpenHelperProvider) {
    return new ApplicationModule_ProvideDaoSessionFactory(module, dbOpenHelperProvider);
  }

  /** Proxies {@link ApplicationModule#provideDaoSession(DbOpenHelper)}. */
  public static DaoSession proxyProvideDaoSession(
      ApplicationModule instance, DbOpenHelper dbOpenHelper) {
    return instance.provideDaoSession(dbOpenHelper);
  }
}
