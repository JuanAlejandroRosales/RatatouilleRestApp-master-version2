package ratatouillerestapp.upc.edu.pe.service;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncService_MembersInjector implements MembersInjector<SyncService> {
  private final Provider<SyncInteractor> mInteractorProvider;

  public SyncService_MembersInjector(Provider<SyncInteractor> mInteractorProvider) {
    assert mInteractorProvider != null;
    this.mInteractorProvider = mInteractorProvider;
  }

  public static MembersInjector<SyncService> create(Provider<SyncInteractor> mInteractorProvider) {
    return new SyncService_MembersInjector(mInteractorProvider);
  }

  @Override
  public void injectMembers(SyncService instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mInteractor = mInteractorProvider.get();
  }

  public static void injectMInteractor(
      SyncService instance, Provider<SyncInteractor> mInteractorProvider) {
    instance.mInteractor = mInteractorProvider.get();
  }
}
