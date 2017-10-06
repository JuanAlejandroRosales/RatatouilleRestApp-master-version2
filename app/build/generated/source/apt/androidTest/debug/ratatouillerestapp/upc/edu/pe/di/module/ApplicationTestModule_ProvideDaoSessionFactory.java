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
public final class ApplicationTestModule_ProvideDaoSessionFactory implements Factory<DaoSession> {
  private final ApplicationTestModule module;

  private final Provider<DbOpenHelper> dbOpenHelperProvider;

  public ApplicationTestModule_ProvideDaoSessionFactory(
      ApplicationTestModule module, Provider<DbOpenHelper> dbOpenHelperProvider) {
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
      ApplicationTestModule module, Provider<DbOpenHelper> dbOpenHelperProvider) {
    return new ApplicationTestModule_ProvideDaoSessionFactory(module, dbOpenHelperProvider);
  }

  /** Proxies {@link ApplicationTestModule#provideDaoSession(DbOpenHelper)}. */
  public static DaoSession proxyProvideDaoSession(
      ApplicationTestModule instance, DbOpenHelper dbOpenHelper) {
    return instance.provideDaoSession(dbOpenHelper);
  }
}
